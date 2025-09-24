package com.example.first_application.ui.theme

import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow

class DiceRepository {

    fun generate(n: Int): Flow<Int> {       // tire au sort un chifre entre 1 et 6
        return flow {
            val chifreDe = (1 .. 6).random()
            emit(chifreDe)
        }
    }
}