// MessageService.kt
package demo

import org.springframework.data.repository.findByIdOrNull
import org.springframework.stereotype.Service
import org.springframework.jdbc.core.JdbcTemplate
import org.springframework.jdbc.core.query
import java.util.*

@Service
class MessageService(private val db: MessageRepository) {
    fun findMessages(): List<Message> = db.findAll().toList()


    fun findMessageById(id: String): Message? = db.findByIdOrNull(id)


    fun save(message: Message): Message = db.save(message)
}