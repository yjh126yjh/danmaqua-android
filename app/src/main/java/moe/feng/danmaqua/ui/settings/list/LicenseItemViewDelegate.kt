package moe.feng.danmaqua.ui.settings.list

import android.view.View
import androidx.content.launchViewUrl
import moe.feng.danmaqua.R
import moe.feng.danmaqua.databinding.LicensesItemLayoutBinding
import moe.feng.danmaqua.model.LicenseItem
import moe.feng.danmaqua.ui.common.list.*

class LicenseItemViewDelegate
    : ItemBasedSimpleViewBinder<LicenseItem, LicenseItemViewDelegate.ViewHolder>() {

    override val viewHolderCreator: ViewHolderCreator<ViewHolder>
        = dataBindingViewHolderCreatorOf(R.layout.licenses_item_layout)

    class ViewHolder(dataBinding: LicensesItemLayoutBinding) :
        DataBindingViewHolder<LicenseItem, LicensesItemLayoutBinding>(dataBinding) {

        fun onCardClick(view: View) {
            context.launchViewUrl(data.url)
        }

    }

}