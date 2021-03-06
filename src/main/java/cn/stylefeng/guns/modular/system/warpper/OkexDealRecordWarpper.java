/**
 * Copyright 2018-2020 stylefeng & fengshuonan (https://gitee.com/stylefeng)
 * <p>
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * <p>
 * http://www.apache.org/licenses/LICENSE-2.0
 * <p>
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package cn.stylefeng.guns.modular.system.warpper;

import cn.stylefeng.guns.core.common.constant.factory.ConstantFactory;
import cn.stylefeng.roses.core.base.warpper.BaseControllerWrapper;
import cn.stylefeng.roses.kernel.model.page.PageResult;
import com.baomidou.mybatisplus.plugins.Page;

import java.util.List;
import java.util.Map;

public class OkexDealRecordWarpper extends BaseControllerWrapper {

    public OkexDealRecordWarpper(Map<String, Object> single) {
        super(single);
    }

    public OkexDealRecordWarpper(List<Map<String, Object>> multi) {
        super(multi);
    }

    public OkexDealRecordWarpper(Page<Map<String, Object>> page) {
        super(page);
    }

    public OkexDealRecordWarpper(PageResult<Map<String, Object>> pageResult) {
        super(pageResult);
    }

    @Override
    protected void wrapTheMap(Map<String, Object> map) {
        map.put("coin", ConstantFactory.me().getCoinName((Integer) map.get("coin_id")));
        map.put("eid", ConstantFactory.me().getExchangeName((Integer) map.get("exchange_id")));
        map.put("orderType", ConstantFactory.me().getOrderTypeName((Integer) map.get("type")));
    }

}
