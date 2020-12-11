package com.monstarlab.core.data.mappers

import com.monstarlab.core.data.network.dtos.PostDto
import com.monstarlab.core.domain.model.Post

fun PostDto.toEntity(): Post {
    return Post(
        id = id,
        title = title,
        body = body
    )
}