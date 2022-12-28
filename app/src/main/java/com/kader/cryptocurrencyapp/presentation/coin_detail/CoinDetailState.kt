package com.kader.cryptocurrencyapp.presentation.coin_detail

import com.kader.cryptocurrencyapp.domain.model.CoinDetail

class CoinDetailState(
    val isLoading: Boolean = false,
    val coin: CoinDetail? = null,
    val error : String = ""
)