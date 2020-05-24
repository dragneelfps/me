import react.*

class App : RComponent<RProps, RState>() {
    override fun RBuilder.render() {
        +"Hello"
    }
}

fun RBuilder.appState(handler: Handler<RProps>): ReactElement {
    return child(App::class) {
        attrs(handler)
    }
}

