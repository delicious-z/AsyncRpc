package com.delicious.asyncRpc
import io.vertx.core.Future


interface MathService {
    fun add(a: Int, b: Int): Future<Int>?
}
