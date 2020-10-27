package furhatos.app.mathtutor.flow.states.division;

import furhatos.app.mathtutor.DIVISION
import furhatos.app.mathtutor.flow.CustomGaze
import furhatos.app.mathtutor.flow.debugMode
import furhatos.app.mathtutor.flow.states.excercises.StartExercises
import furhatos.flow.kotlin.furhat
import furhatos.flow.kotlin.state

val DivisionFinal = state {
    onEntry {
        parallel {
            goto(CustomGaze)
        }
        if (debugMode()) {
            furhat.say("Division Final")
        } else {
            furhat.say("Very well done. I think you are ready to try some exercises!")
        }
        delay(1000)
        goto(StartExercises(DIVISION))
    }
}
