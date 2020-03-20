package com.example.materialcomponents

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.example.materialcomponents.model.ComponentCardEntity

class MainViewModel: ViewModel() {

    val componentCardEntities: List<ComponentCardEntity> by lazy {
        listOf(
            ComponentCardEntity(R.drawable.ic_bottomappbar, R.string.str_bottom_appbar),
            ComponentCardEntity(R.drawable.ic_bottomnavigation, R.string.str_bottom_navigation),
            ComponentCardEntity(R.drawable.ic_bottomsheet, R.string.str_bottom_sheet),
            ComponentCardEntity(R.drawable.ic_button, R.string.str_button),
            ComponentCardEntity(R.drawable.ic_card, R.string.str_cards),
            ComponentCardEntity(R.drawable.ic_checkbox, R.string.str_check_box),
            ComponentCardEntity(R.drawable.ic_chips, R.string.str_chips),
            ComponentCardEntity(R.drawable.ic_dialog, R.string.str_dialogs),
            ComponentCardEntity(R.drawable.ic_elevation, R.string.str_elevation_shadow),
            ComponentCardEntity(R.drawable.ic_fab, R.string.str_fab),
            ComponentCardEntity(R.drawable.ic_fonts, R.string.str_fonts),
            ComponentCardEntity(R.drawable.ic_components_24px, R.string.str_image_view),
            ComponentCardEntity(R.drawable.ic_menu, R.string.str_menus),
            ComponentCardEntity(R.drawable.ic_radiobutton, R.string.str_radio_button),
            ComponentCardEntity(R.drawable.ic_shape, R.string.str_shape_theming),
            ComponentCardEntity(R.drawable.ic_sliders_24px, R.string.str_sliders),
            ComponentCardEntity(R.drawable.ic_switch, R.string.str_switchs),
            ComponentCardEntity(R.drawable.ic_tabs, R.string.str_tabs),
            ComponentCardEntity(R.drawable.ic_textfield, R.string.str_text_field),
            ComponentCardEntity(R.drawable.ic_topappbar, R.string.str_top_appbar),
            ComponentCardEntity(R.drawable.ic_transition, R.string.str_transitions)
        )
    }


    class Factory() : ViewModelProvider.NewInstanceFactory() {

        override fun <T : ViewModel?> create(modelClass: Class<T>): T {
            if (modelClass.isAssignableFrom(MainViewModel::class.java)) {
                return MainViewModel() as T
            }

            throw IllegalArgumentException("not MainViewMode class")
        }
    }

}