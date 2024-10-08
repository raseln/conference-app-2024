package io.github.droidkaigi.confsched.model

import kotlinx.collections.immutable.PersistentList
import kotlinx.collections.immutable.persistentListOf

data class TimetableItemList(
    val timetableItems: PersistentList<TimetableItem> = persistentListOf(),
) : PersistentList<TimetableItem> by timetableItems
