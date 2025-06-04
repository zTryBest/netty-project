package com.example.im;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

/**
 * 消息类型枚举
 */
@RequiredArgsConstructor
@Getter
public enum MessageType {
    LOGIN,
    LOGOUT,
    PING,
    PONG,
    CHAT,
    GROUP_CHAT,
    ACK,
    MODIFY,
    ERROR;
}
