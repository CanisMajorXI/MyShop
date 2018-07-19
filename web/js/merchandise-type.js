let merchandise = {};
let total_page = 0;
let cur_page = 0;
let merch_show = [];
let colorarray = ['active', 'success', 'info', 'warning', 'danger'];
$(function () {
    $.ajax({
        type: "post",
        url: "/api/merchandise-type/query",
        data: JSON.stringify(new MerchandiseType(null, null, null, null, null, null)),
        contentType: "application/json; charset=utf-8",
        dataType: "json",
        success: function (result) {
            merchandise = result;
            merch_show = merchandise;
            pageFresh();
            render();
        }
    });
    let pageFresh = function () {
        total_page = Math.ceil(merch_show.length / 5);
        cur_page = 1;
        //alert("total"+total_page + "curpos"+cur_page);
    }
    let render = function () {
        $(".merchandise-table tbody").empty();
        for (let i = 0; i < 5; i++) {
            if (merch_show[(cur_page - 1) * 5 + i] === undefined) break;
            $(".merchandise-table tbody").append('<tr class="' + colorarray[i] + '">'
                + '<td>' + merch_show[(cur_page - 1) * 5 + i].id + '</td>'
                + '<td>' + merch_show[(cur_page - 1 ) * 5 + i].name + '</td>'
                + '<td>' + merch_show[(cur_page - 1 ) * 5 + i].retailPrice + '</td>'
                + ' <td>' + merch_show[(cur_page - 1) * 5 + i].wholesalePrice + '</td>'
                + '<td>' + merch_show[(cur_page - 1) * 5 + i].expiration + '天' + '</td>'
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
            merch_show  = merchandise;
            pageFresh();
            render();
            return;
        }
        merch_show = merchandise.filter(function (element) {
            //    alert(element.name === text);
            return element.name === text;
        });
        pageFresh();
        render();
        // arrnew[text] = $.map(merchandise, item => {
        //     if (item.name === text) return item.id;
        // });

        //alert(arrnew.length);
    });

});
[{
    "id": 1,
    "name": "脑白金",
    "picture": "111",
    "expiration": 111,
    "purchasePrice": 500,
    "wholesalePrice": 800,
    "retailPrice": 999
}, {
    "id": 2,
    "name": "脑黄金",
    "picture": null,
    "expiration": 111111111,
    "purchasePrice": 100,
    "wholesalePrice": 200,
    "retailPrice": 300
}, {
    "id": 3,
    "name": "安利",
    "picture": null,
    "expiration": 111111111,
    "purchasePrice": 100,
    "wholesalePrice": 200,
    "retailPrice": 300
}, {
    "id": 4,
    "name": "纽崔莱",
    "picture": null,
    "expiration": 111111111,
    "purchasePrice": 100,
    "wholesalePrice": 200,
    "retailPrice": 300
}, {
    "id": 5,
    "name": "纽崔莱",
    "picture": null,
    "expiration": 111111111,
    "purchasePrice": 100,
    "wholesalePrice": 200,
    "retailPrice": 300
}, {
    "id": 6,
    "name": "纽崔莱",
    "picture": null,
    "expiration": 111111111,
    "purchasePrice": 100,
    "wholesalePrice": 200,
    "retailPrice": 300
}, {
    "id": 7,
    "name": "小罐茶",
    "picture": null,
    "expiration": 111111111,
    "purchasePrice": 100,
    "wholesalePrice": 200,
    "retailPrice": 300
}]