$(function() {
    $(".btn-destroy").click(function(e) {
        if(!confirm("Bạn thực sự muốn xóa?")) {
            e.preventDefault();
        }
    })

    $("#content").summernote({
        placeholder: 'Nội dung tài liệu',
        tabsize: 2,
        height: 240,
        toolbar: [
            ['style', ['style']],
            ['font', ['bold', 'underline', 'clear']],
            ['color', ['color']],
            ['para', ['ul', 'ol', 'paragraph']],
            ['table', ['table']],
            ['insert', ['link', 'picture', 'video']],
            ['view', ['fullscreen', 'codeview', 'help']]
        ]
    });

    $(".submit-on-enter").keypress(function(e) {
        if(e.which === 13) {
            this.form.submit();
        }
    })

    $(".submit-on-change").change(function(e) {
        this.form.submit();
    })
})