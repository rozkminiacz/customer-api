package com.michalik.api

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import java.util.*

data class Customer(
        val id: String = "",
        val firstName: String = "",
        val lastName: String = "",
        val email: String = "",
        val phone: String = "",
        val avatar: String = "")

val mockUsers = listOf<Customer>(
        Customer(UUID.randomUUID().toString(), "John", "Messershmidt", "john@internet.com", "+48 699 944 729", "https://randomuser.me/api/portraits/men/${(Random().nextInt() % 99) * -1}.jpg"),
        Customer(UUID.randomUUID().toString(), "Jane", "Werberg", "werber@internet.com", "+48 402 423 555", "https://randomuser.me/api/portraits/women/${(Random().nextInt() % 99) * -1}.jpg"),
        Customer(UUID.randomUUID().toString(), "Erwin", "Schrodinger", "erwin@internet.com", "+48 222 333 444", "https://randomuser.me/api/portraits/men/${(Random().nextInt() % 99) * -1}.jpg"),
        Customer(UUID.randomUUID().toString(), "Max", "Plank", "max@internet.com", "+48 527 423 107", "https://randomuser.me/api/portraits/men/${(Random().nextInt() % 99) * -1}.jpg"),
        Customer(UUID.randomUUID().toString(), "Franz", "Ferdynand", "franz@internet.com", "+48 434 253 037", "https://randomuser.me/api/portraits/men/${(Random().nextInt() % 99) * -1}.jpg"),
        Customer(UUID.randomUUID().toString(), "Luna", "Lovegood", "luna@internet.com", "+48 534 853 037", "https://randomuser.me/api/portraits/women/${(Random().nextInt() % 99) * -1}.jpg"),
        Customer(UUID.randomUUID().toString(), "Eva", "March", "eva@internet.com", "+48 534 253 037", "https://randomuser.me/api/portraits/women/${(Random().nextInt() % 99) * -1}.jpg"),
        Customer(UUID.randomUUID().toString(), "Roman", "Pietrovsky", "roman@internet.com", "+48 524 253 037", "https://randomuser.me/api/portraits/men/${(Random().nextInt() % 99) * -1}.jpg"),
        Customer(UUID.randomUUID().toString(), "Han", "Multiple", "han@internet.com", "+48 594 253 037", "https://randomuser.me/api/portraits/men/${(Random().nextInt() % 99) * -1}.jpg"),
        Customer(UUID.randomUUID().toString(), "Tatiana", "Okrutnik", "okrutnik1@internet.com", "+48 534 253 037", "https://randomuser.me/api/portraits/women/${(Random().nextInt() % 99) * -1}.jpg"))

@RestController
@RequestMapping("/api")
class CustomerController {
    @GetMapping
    fun getAll(): List<Customer> {
        return mockUsers
    }
}