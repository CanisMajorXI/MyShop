(function () {
    let merchandise = {};
    let total_page = 0;
    let cur_page = 0;
    let merch_show = [];
    let colorarray = ['active', 'success', 'info', 'warning', 'danger'];
    $(function () {
        $.get("/api/merchandises/query", function (result) {
            merchandise = result;
            merch_show = merchandise;
           // alert(JSON.stringify(result));
            pageFresh();
            render();
        }, "json");
        let pageFresh = function () {
            total_page = Math.ceil(merch_show.length / 5);
            cur_page = 1;
        }
        let render = function () {
            $(".merchandise-table tbody").empty();
            for (let i = 0; i < 5; i++) {
                if (merch_show[(cur_page - 1) * 5 + i] === undefined) break;
                $(".merchandise-table tbody").append('<tr class="' + colorarray[i] + '">'
                    + '<td>' + merch_show[(cur_page - 1) * 5 + i].key.id + '</td>'
                    + '<td>' + merch_show[(cur_page - 1 ) * 5 + i].value.name + '</td>'
                    + '<td>' + merch_show[(cur_page - 1 ) * 5 + i].key.productDate + '</td>'
                    + '<td>' + merch_show[(cur_page - 1) * 5 + i].value.expiration + '天' + '</td>'
                    + '</tr>');
            }
            //  alert(merchandise[0].id);
        };
        $(".merchandise-table .previous").click(function () {
            if (cur_page > 1) {
                cur_page--;
                render();
            } else {
                alert("已经到第一页了！");
            }
        });
        $(".merchandise-table .next").click(function () {
            if (cur_page < total_page) {
                cur_page++;
                render();
            }
            else {
                alert("已经到最后一页了！");
            }
        });
        $(".merchandise-table .show-by-name-btn").click(function () {
            let text = $(".merchandise-table .show-by-name-text").val();
            if (text === '') {
                merch_show = merchandise;
                pageFresh();
                render();
                return;
            }
            merch_show = merchandise.filter(function (element) {
                //    alert(element.name === text);
                return element.value.name === text;
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

// [{
//     "key": {"id": 1, "typeId": 1, "productDate": "2018-07-15", "valid": 0},
//     "value": {
//         "id": 1,
//         "name": "脑白金",
//         "picture": "111",
//         "expiration": 111,
//         "purchasePrice": 500,
//         "wholesalePrice": 800,
//         "retailPrice": 999
//     }
// }, {
//     "key": {"id": 5, "typeId": 1, "productDate": "2018-06-11", "valid": 0},
//     "value": {
//         "id": 1,
//         "name": "脑白金",
//         "picture": "111",
//         "expiration": 111,
//         "purchasePrice": 500,
//         "wholesalePrice": 800,
//         "retailPrice": 999
//     }
// }, {
//     "key": {"id": 6, "typeId": 2, "productDate": "2018-06-11", "valid": 0},
//     "value": {
//         "id": 2,
//         "name": "脑黄金",
//         "picture": null,
//         "expiration": 220,
//         "purchasePrice": 100,
//         "wholesalePrice": 200,
//         "retailPrice": 300
//     }
// }, {
//     "key": {"id": 7, "typeId": 1, "productDate": "2018-06-11", "valid": 1},
//     "value": {
//         "id": 1,
//         "name": "脑白金",
//         "picture": "111",
//         "expiration": 111,
//         "purchasePrice": 500,
//         "wholesalePrice": 800,
//         "retailPrice": 999
//     }
// }, {
//     "key": {"id": 8, "typeId": 2, "productDate": "2018-07-12", "valid": 0},
//     "value": {
//         "id": 2,
//         "name": "脑黄金",
//         "picture": null,
//         "expiration": 220,
//         "purchasePrice": 100,
//         "wholesalePrice": 200,
//         "retailPrice": 300
//     }
// }, {
//     "key": {"id": 9, "typeId": 1, "productDate": "2018-07-12", "valid": 1},
//     "value": {
//         "id": 1,
//         "name": "脑白金",
//         "picture": "111",
//         "expiration": 111,
//         "purchasePrice": 500,
//         "wholesalePrice": 800,
//         "retailPrice": 999
//     }
// }, {
//     "key": {"id": 10, "typeId": 3, "productDate": "2018-07-12", "valid": 1},
//     "value": {
//         "id": 3,
//         "name": "安利",
//         "picture": null,
//         "expiration": 180,
//         "purchasePrice": 100,
//         "wholesalePrice": 200,
//         "retailPrice": 300
//     }
// }, {
//     "key": {"id": 11, "typeId": 2, "productDate": "2018-07-12", "valid": 0},
//     "value": {
//         "id": 2,
//         "name": "脑黄金",
//         "picture": null,
//         "expiration": 220,
//         "purchasePrice": 100,
//         "wholesalePrice": 200,
//         "retailPrice": 300
//     }
// }, {"key": {"id": 12, "typeId":...