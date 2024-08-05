package com.example.mywishlistapp.data

import kotlinx.coroutines.flow.Flow

class WishRepository(private val wishDao: WishDao) {

    suspend fun addAWish(wish: Wish){
        wishDao.addAWish(wish)
    }
    fun getWishes(): Flow<List<Wish>> =wishDao.getAllWish()

    fun getAWishById(id:Long):Flow<Wish>{
        return wishDao.getAWishesById(id)
    }
    suspend fun updateAWish(wish: Wish){
        wishDao.updateAWish(wish)
    }
    suspend fun deleteAWish(wish: Wish){
        wishDao.deleteAWish(wish)
    }
}