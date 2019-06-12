package com.backbase.test.instantiator

import java.util.Random

/**
 * Created by Backbase R&D B.V. on 2019-06-12.
 * Instantiates a byte via the provided [Random] instance.
 */
class RandomByteInstantiator(random: Random) : RandomInstantiator<Byte>(random) {

    override fun instantiate(random: Random): Byte {
        val byteArray = ByteArray(1)
        random.nextBytes(byteArray)
        return byteArray[0]
    }

    override fun supportedClass() = Byte::class.java
}