package com.drakeet.multitype

import android.content.Context
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import androidx.viewbinding.ViewBinding
import com.wasu.library.uibase.ext.inflateBindingWithGeneric

/**
 * 扩展ViewBinding Delegate
 *
 * @author Nicky
 * @Email yundong.li@zhilink.net
 * @date 2023/8/04 16:06 PM
 */
abstract class ViewBindingDelegate<T, VB : ViewBinding> :
    ItemViewDelegate<T, ViewBindingViewHolder<VB>>() {

    override fun onCreateViewHolder(
        context: Context,
        parent: ViewGroup,
    ): ViewBindingViewHolder<VB> {
        return ViewBindingViewHolder(inflateBindingWithGeneric(parent))
    }
}

class ViewBindingViewHolder<VB : ViewBinding>(val binding: VB) :
    RecyclerView.ViewHolder(binding.root)
