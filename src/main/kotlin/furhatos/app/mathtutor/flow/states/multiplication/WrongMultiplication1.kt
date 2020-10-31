package furhatos.app.mathtutor.flow.states.multiplication


import furhatos.app.mathtutor.MULTIPLICATION
import furhatos.app.mathtutor.flow.CustomGaze
import furhatos.app.mathtutor.flow.Interaction
import furhatos.app.mathtutor.flow.emotion.getGenericWrongResponse
import furhatos.app.mathtutor.flow.states.multiplication.MultiplicationExample
import furhatos.app.mathtutor.wrongConsecutiveResponse
import furhatos.flow.kotlin.State
import furhatos.flow.kotlin.furhat
import furhatos.flow.kotlin.state
import furhatos.flow.kotlin.users

fun WrongMultiplication1(times: Int, value: Int): State = state(Interaction) {
    onEntry {
        parallel {
            goto(CustomGaze)
        }
        furhat.say(getGenericWrongResponse(users.current.wrongConsecutiveResponse, MULTIPLICATION))
        delay(1000)
        goto(MultiplicationPractice1(times, value));
    }
}
