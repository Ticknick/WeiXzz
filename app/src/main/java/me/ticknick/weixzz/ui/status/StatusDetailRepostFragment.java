package me.ticknick.weixzz.ui.status;

import android.os.Bundle;
import android.support.v7.widget.RecyclerView;

import me.ticknick.weixzz.adapter.status.RepostSdAdapter;
import me.ticknick.weixzz.dao.statusdetail.BaseStatusDetailDao;
import me.ticknick.weixzz.dao.statusdetail.RepostStatusSdDAO;
import me.ticknick.weixzz.model.RepostListModel;

/**
 * Created by Finderlo on 2016/8/24.
 */

public class StatusDetailRepostFragment extends BaseSdReclclerFragment {
    @Override
    protected RecyclerView.Adapter bindAdapter() {
        RepostSdAdapter adapter = new RepostSdAdapter(getActivity(), (RepostListModel) mDao.getList());
        return adapter;
    }

    @Override
    protected BaseStatusDetailDao bindDAO() {
        return new RepostStatusSdDAO(getActivity(),mStatusId);
    }


    public static StatusDetailRepostFragment newInstance(long statusId) {
        StatusDetailRepostFragment fragment = new StatusDetailRepostFragment();
        Bundle args = new Bundle();
        args.putLong(ARG_STATUS_ID, statusId);
        fragment.setArguments(args);
        return fragment;
    }

}
