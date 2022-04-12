package kg.geektech.kotlindz4

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class ViewModel : ViewModel() {

    var count = 0
    var counter = MutableLiveData<Int>()
    var string = MutableLiveData<String>()

    fun plus() {
        counter.value = ++count
        string.value = "+"
    }

    fun minus() {
        counter.value = --count
        string.value = "-"
    }

}