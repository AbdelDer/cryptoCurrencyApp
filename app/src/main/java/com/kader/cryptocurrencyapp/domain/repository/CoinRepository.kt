package com.kader.cryptocurrencyapp.domain.repository

import com.kader.cryptocurrencyapp.data.remote.dto.CoinDetailDto
import com.kader.cryptocurrencyapp.data.remote.dto.CoinDto

interface CoinRepository {

    suspend fun getCoins(): List<CoinDto>

    suspend fun getCoinById(coinId: String): CoinDetailDto
}