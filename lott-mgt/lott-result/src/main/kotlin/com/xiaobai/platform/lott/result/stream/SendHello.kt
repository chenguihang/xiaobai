package com.xiaobai.platform.lott.result.stream

import org.slf4j.LoggerFactory
import org.springframework.cloud.stream.annotation.EnableBinding
import org.springframework.messaging.support.MessageBuilder
import org.springframework.stereotype.Component

/**
 *
 *  @author  : xiaobai
 */
@EnableBinding(LottDataDrawSource::class)
@Component
class SendHello(private val source: LottDataDrawSource) {

    private val log = LoggerFactory.getLogger(this::class.java)

    fun sendProcess(name: String) {
        val msg = "$name say hello."
        log.info("发送数据：$msg")
        source.output.send(MessageBuilder.withPayload(msg.toByteArray()).build())
    }


}