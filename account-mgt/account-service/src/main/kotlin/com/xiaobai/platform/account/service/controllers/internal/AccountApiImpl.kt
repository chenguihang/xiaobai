package com.xiaobai.platform.account.service.controllers.internal

import com.xiaobai.platform.account.api.AccountApi
import com.xiaobai.platform.account.data.entity.Account
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RestController
import java.time.LocalDateTime

/**
 *
 *  @author  : cabbage
 */
@RestController
class AccountApiImpl : AccountApi {

    override fun get(@PathVariable("id") id: Long): Account {
        println("----------------------id = $id")
        return Account(id, "小白", "123456", LocalDateTime.now())
    }

    override fun all(): MutableList<Account> {
        val xiaoBai = Account(1L, "小白", "123456", LocalDateTime.now())
        val xiaoHuang = Account(2L, "小黄", "123456", LocalDateTime.now())

        return mutableListOf(xiaoBai, xiaoHuang)
    }

    override fun create(account: Account) {
    }
}