(function () {
    let purchase_record = {};
    let total_page = 0;
    let cur_page = 0;
    let record_show = [];
    let colorarray = ['active', 'success', 'info', 'warning', 'danger'];
    $(function () {
        $.get("/api/vip/query", function (result) {
            //alert(JSON.stringify(result));
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
            $(".member-table tbody").empty();
            for (let i = 0; i < 5; i++) {
                if (record_show[(cur_page - 1) * 5 + i] === undefined) break;
                $(".member-table tbody").append('<tr class="' + colorarray[i] + '">'
                    + '<td>' + record_show[(cur_page - 1) * 5 + i].key.id + '</td>'
                    + '<td>' + record_show[(cur_page - 1 ) * 5 + i].key.phoneNumber+ '</td>'
                    + '<td>' + record_show[(cur_page - 1 ) * 5 + i].value.name + '</td>'
                    + '<td>' + record_show[(cur_page - 1) * 5 + i].value.discount + '</td>'
                    + '</tr>');
            }
            //  alert(merchandise[0].id);
        };
        $(".member-table .previous").click(function () {
            if (cur_page > 1) {
                cur_page--;
                render();
            } else {
                alert("已经到第一页了！");
            }
        });
        $(".member-table .next").click(function () {
            if (cur_page < total_page) {
                cur_page++;
                render();
            }
            else {
                alert("已经到最后一页了！");
            }
        });
        $(".member-table .show-by-name-btn").click(function () {
            let text = $(".member-table .show-by-name-text").val();
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
    let adasada= [{"key":{"id":1,"typeId":1,"phoneNumber":"19530615"},"value":{"id":1,"name":"黑曜石","discount":75}}];
})();
