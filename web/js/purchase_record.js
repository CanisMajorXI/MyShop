(function () {
    let purchase_record = {};
    let total_page = 0;
    let cur_page = 0;
    let record_show = [];
    let colorarray = ['active', 'success', 'info', 'warning', 'danger'];
    $(function () {
        $.get("/api/purchase-record/query", function (result) {
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
        let render = function () {
            $(".purchase-record-table tbody").empty();
            for (let i = 0; i < 5; i++) {
                if (record_show[(cur_page - 1) * 5 + i] === undefined) break;
                $(".purchase-record-table tbody").append('<tr class="' + colorarray[i] + '">'
                    + '<td>' + record_show[(cur_page - 1) * 5 + i].attr1.id + '</td>'
                    + '<td>' + record_show[(cur_page - 1 ) * 5 + i].attr2.id + '</td>'
                    + '<td>' + record_show[(cur_page - 1 ) * 5 + i].attr3.name + '</td>'
                    + '<td>' + record_show[(cur_page - 1) * 5 + i].attr1.date + '</td>'
                    + '<td>' + record_show[(cur_page - 1) * 5 + i].attr2.productDate + '</td>'
                    + '</tr>');
            }
            //  alert(merchandise[0].id);
        };
        $(".purchase-record-table .previous").click(function () {
            if (cur_page > 1) {
                cur_page--;
                render();
            } else {
                alert("已经到第一页了！");
            }
        });
        $(".purchase-record-table .next").click(function () {
            if (cur_page < total_page) {
                cur_page++;
                render();
            }
            else {
                alert("已经到最后一页了！");
            }
        });
        $(".purchase-record-table .show-by-name-btn").click(function () {
            let text = $(".purchase-record-table .show-by-name-text").val();
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

let testdemo = [{
    "attr1": {"id": 5, "merchandiseId": 5, "date": "2018-07-17T18:23:49"},
    "attr2": {"id": 5, "typeId": 1, "productDate": "2018-06-11", "valid": 0},
    "attr3": {
        "id": 1,
        "name": "脑白金",
        "picture": "111",
        "expiration": 111,
        "purchasePrice": 500,
        "wholesalePrice": 800,
        "retailPrice": 999
    }
}, {
    "attr1": {"id": 5, "merchandiseId": 6, "date": "2018-07-17T18:23:49"},
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
}, {
    "attr1": {"id": 5, "merchandiseId": 7, "date": "2018-07-17T18:23:49"},
    "attr2": {"id": 7, "typeId": 1, "productDate": "2018-06-11", "valid": 1},
    "attr3": {
        "id": 1,
        "name": "脑白金",
        "picture": "111",
        "expiration": 111,
        "purchasePrice": 500,
        "wholesalePrice": 800,
        "retailPrice": 999
    }
}]