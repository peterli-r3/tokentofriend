package com.tokentofriend.states

import net.corda.core.contracts.BelongsToContract
import net.corda.core.contracts.UniqueIdentifier
import net.corda.core.identity.Party
import com.r3.corda.lib.tokens.contracts.states.EvolvableTokenType
import com.tokentofriend.contracts.CustomTokenContract


// *********
// * State *
// *********
@BelongsToContract(CustomTokenContract::class)
data class CustomTokenState(val Issuer: String,
                            val recipient : String,
                            val message: String,
                            val maintainer: Party,
                            override val fractionDigits: Int,
                            override val linearId: UniqueIdentifier,
                            override val maintainers: List<Party> = listOf(maintainer)) : EvolvableTokenType()