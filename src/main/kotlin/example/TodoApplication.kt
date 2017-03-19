package example

import example.Repositories.UserRepository
import example.Services.RegisterUser
import example.User.User
import example.view.SignUpPage
import kotlin.browser.document

/**
 * Created by ryota on 2017/03/19.
 */

object TodoApplication {
    fun start() {
        val repo = object : UserRepository {
            var tmpStore: Map<User.Id, User> = emptyMap()
            override fun store(user: User, callback: Callback<Error, Unit>) {
                if (!tmpStore.containsKey(user.id)) {
                    tmpStore = tmpStore.plus(Pair(user.id, user))
                    callback(null, Unit)
                } else {
                    callback(Error("duplication id"), null)
                }
            }

            override fun findById(id: User.Id, callback: Callback<Error, User>) {
                val user = tmpStore.get(id)
                if (user == null)
                    callback(Error("not found user"), null)
                else
                    callback(null, user)
            }
        }
        val app = SignUpPage(RegisterUser(repository = repo)) {
            console.log("signIn")
        }

        app.onUpdate {
            Yakitori.render(app.view(), document.getElementById("main")!!)
        }

        Yakitori.render(app.view(), document.getElementById("main")!!)
    }
}