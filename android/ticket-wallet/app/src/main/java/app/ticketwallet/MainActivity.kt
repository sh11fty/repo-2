package app.ticketwallet

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import java.time.LocalDate
import java.time.temporal.ChronoUnit

data class Ticket(val name: String, val expires: LocalDate) {
    fun daysLeft(today: LocalDate = LocalDate.now()): Long = ChronoUnit.DAYS.between(today, expires)
}

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        // Placeholder data; replace with Room-backed storage and photo capture.
        val tickets = listOf(
            Ticket("Public liability insurance", LocalDate.now().plusDays(25)),
            Ticket("CSCS card", LocalDate.now().plusDays(120)),
        )
        setContent { MaterialTheme { TicketList(tickets) } }
    }
}

@Composable
fun TicketList(tickets: List<Ticket>) {
    LazyColumn(Modifier.padding(16.dp)) {
        items(tickets.sortedBy { it.expires }) { t ->
            Column(Modifier.padding(vertical = 8.dp)) {
                Text(t.name, style = MaterialTheme.typography.titleMedium)
                Text("${t.daysLeft()} days left")
            }
        }
    }
}
