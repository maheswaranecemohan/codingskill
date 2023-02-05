package com.vm.codingskillapplication.zzznewui.ui.main

import androidx.lifecycle.ViewModel

class MainViewModel : ViewModel() {
    init {
        setStateEvent(StateEvent.Enent1)
    }

    fun setStateEvent(event : StateEvent){
        when(event){
           is StateEvent.Enent1 -> {

            }
            StateEvent.Enent2 -> {

            }
            StateEvent.Enent3 -> {
            }

            }
        }

    sealed class StateEvent(){
        object Enent1 : StateEvent()
        object Enent2 : StateEvent()
        object Enent3 : StateEvent()
    }
    }





