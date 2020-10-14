package furhatos.app.mathtutor.flow.states.addition;

import furhatos.app.mathtutor.flow.CustomGaze
import furhatos.flow.kotlin.furhat
import furhatos.flow.kotlin.state

val WrongAddition2 = state {
    onEntry {
        parallel {
            goto(CustomGaze)
        }
        furhat.say("Wrong Addition 2")
    }
}
