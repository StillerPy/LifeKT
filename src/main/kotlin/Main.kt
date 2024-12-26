import tornadofx.App
import tornadofx.vbox
import tornadofx.View
import tornadofx.launch

class MyView : View("My View") {
    override val root = vbox {

    }
}

class MyApp: App(MyView::class)

fun main() {
    launch<MyApp>()
}