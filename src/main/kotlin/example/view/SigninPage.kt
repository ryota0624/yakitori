package example.view

import Inferno.InfernoElement
import YakitoriElement
import YakitoriTag.Companion.children
import YakitoriTag.Companion.props
import example.Services.RegisterUser
import example.User.User

/**
 * Created by ryota on 2017/03/19.
 */

class SignUpPage(val service: RegisterUser, val signUp: () -> Unit) {
    var onUpdates: List<() -> Unit> = emptyList()
    var nameForm = ""
    var errorMessage: String? = null

    val inputNameForm: (String) -> Unit = {
        nameForm = it
    }

    val submitSignIn: () -> Unit = {
        service.execute(name = nameForm) { error, _ ->
            if (error == null) {
                signUp()
            } else {
                errorMessage = error.message
            }
        }
        update()
    }

    fun onUpdate(callback: () -> Unit) {
        onUpdates = onUpdates.plus(callback)
    }

    fun update() {
        onUpdates.forEach {
            it()
        }
    }
    fun view(): YakitoriElement {
        return YakitoriTag.y("div", children = children(
                YakitoriTag.y("input", props = props(
                        EventProp.onInputText(inputNameForm)
                )),
                errorMessageView(errorMessage),
                YakitoriTag.y("button", text = "signup", props = props(
                        EventProp.onClick { submitSignIn() }
                ))
        ))
    }

    fun errorMessageView(msg: String?): YakitoriElement? {
        return if (msg == null) null else YakitoriTag.y("b", msg)
    }
}
