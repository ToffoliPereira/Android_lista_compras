package toffolipereira.com.github.android_lista_compras.data

import androidx.room.Database
import androidx.room.RoomDatabase
import toffolipereira.com.github.android_lista_compras.model.ItemModel

@Database(entities = [ItemModel::class], version = 1)
abstract class ItemDatabase : RoomDatabase() {
    abstract fun itemDao(): ItemDao
}