(function () {
    let purchase_record = {};
    let total_page = 0;
    let cur_page = 0;
    let record_show = [];
    let colorarray = ['active', 'success', 'info', 'warning', 'danger'];
    $(function () {
        $.get("/api/retail-record/query", function (result) {
           // alert(JSON.stringify(result));
            purchase_record = result;
            record_show = purchase_record;
            // alert(JSON.stringify(result));
            pageFresh();
            render();
        }, "json");
        let pageFresh = function () {
            total_page = Math.ceil(record_show.length / 5);
            cur_page = 1;
        }
            // <th>零售单号</th>
            // <th>商品单号</th>
            // <th>商品名称</th>
            // <th>零售订单时间</th>
            // <th>实际售价</th>
            // <th>客户会员卡号</th>
            // <th>收银员ID</th>
        let render = function () {
            $(".retail-record-table tbody").empty();
            for (let i = 0; i < 5; i++) {
                if (record_show[(cur_page - 1) * 5 + i] === undefined) break;
                $(".retail-record-table tbody").append('<tr class="' + colorarray[i] + '">'
                    + '<td>' + record_show[(cur_page - 1) * 5 + i].attr1.id + '</td>'
                    + '<td>' + record_show[(cur_page - 1 ) * 5 + i].attr2.id + '</td>'
                    + '<td>' + record_show[(cur_page - 1 ) * 5 + i].attr3.name + '</td>'
                    + '<td>' + record_show[(cur_page - 1) * 5 + i].attr1.date + '</td>'
                    + '<td>' + record_show[(cur_page - 1) * 5 + i].attr1.realPrice + '</td>'
                    + '<td>' + record_show[(cur_page - 1) * 5 + i].attr1.vipid + '</td>'
                    + '<td>' + record_show[(cur_page - 1) * 5 + i].attr1.salesmenId + '</td>'
                    + '</tr>');
            }
            //  alert(merchandise[0].id);
        };
        $(".retail-record-table .previous").click(function () {
            if (cur_page > 1) {
                cur_page--;
                render();
            } else {
                alert("已经到第一页了！");
            }
        });
        $(".retail-record-table .next").click(function () {
            if (cur_page < total_page) {
                cur_page++;
                render();
            }
            else {
                alert("已经到最后一页了！");
            }
        });
        $(".retail-record-table .show-by-name-btn").click(function () {
            let text = $(".retail-record-table .show-by-name-text").val();
            if (text === '') {
                record_show = purchase_record;
                pageFresh();
                render();
                return;
            }
            record_show = purchase_record.filter(function (element) {
                //    alert(element.name === text);
                return element.attr3.name === text;
            });
            pageFresh();
            render();
            // arrnew[text] = $.map(merchandise, item => {
            //     if (item.name === text) return item.id;
            // });

            //alert(arrnew.length);
        });

    });
})();
/*

* */
const adsadadasdc= [{
    "attr1": {"id": 1, "merchandiseId": 8, "date": "2018-07-19", "vipid": 1, "realPrice": 37500, "salesmenId": 1},
    "attr2": {"id": 8, "typeId": 2, "productDate": "2018-07-12", "valid": 0},
    "attr3": {
        "id": 2,
        "name": "脑黄金",
        "picture": null,
        "expiration": 220,
        "purchasePrice": 100,
        "wholesalePrice": 200,
        "retailPrice": 300
    }
}, {
    "attr1": {"id": 2, "merchandiseId": 11, "date": "2018-07-19", "vipid": 1, "realPrice": 37500, "salesmenId": 1},
    "attr2": {"id": 11, "typeId": 2, "productDate": "2018-07-12", "valid": 0},
    "attr3": {
        "id": 2,
        "name": "脑黄金",
        "picture": null,
        "expiration": 220,
        "purchasePrice": 100,
        "wholesalePrice": 200,
        "retailPrice": 300
    }
}, {
    "attr1": {"id": 3, "merchandiseId": 12, "date": "2018-07-19", "vipid": 1, "realPrice": 37500, "salesmenId": 1},
    "attr2": {"id": 12, "typeId": 2, "productDate": "2018-07-12", "valid": 0},
    "attr3": {
        "id": 2,
        "name": "脑黄金",
        "picture": null,
        "expiration": 220,
        "purchasePrice": 100,
        "wholesalePrice": 200,
        "retailPrice": 300
    }
}, {
    "attr1": {"id": 4, "merchandiseId": 6, "date": "2018-07-19", "vipid": 1, "realPrice": 37500, "salesmenId": 1},
    "attr2": {"id": 6, "typeId": 2, "productDate": "2018-06-11", "valid": 0},
    "attr3": {
        "id": 2,
        "name": "脑黄金",
        "picture": null,
        "expiration": 220,
        "purchasePrice": 100,
        "wholesalePrice": 200,
        "retailPrice": 300
    }
}]