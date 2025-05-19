package toffolipereira.com.github.android_lista_compras.model

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity // Anotação que indica que esta classe é uma entidade, ou seja, uma tabela no banco de dados.
data class ItemModel(

    @PrimaryKey(autoGenerate = true)    // Anotação que indica que este campo é a chave primária da tabela.
    val id: Int = 0,    // O valor padrão é 0, mas será substituído pelo valor gerado automaticamente pelo Room.
    val name: String
)