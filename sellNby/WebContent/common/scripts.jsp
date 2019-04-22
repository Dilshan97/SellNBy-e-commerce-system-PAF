
    <!-- JQuery -->
    <script type="text/javascript" src="assets/js/jquery-3.3.1.min.js"></script>

    <!-- Bootstrap tooltips -->
    <script type="text/javascript" src="assets/js/popper.min.js"></script>

    <!-- Bootstrap core JavaScript -->
    <script type="text/javascript" src="assets/js/bootstrap.min.js"></script>

    <!-- MDB core JavaScript -->
    <script type="text/javascript" src="assets/js/mdb.min.js"></script>

    <script type="text/javascript">
        /* WOW.js init */
        new WOW().init();

        // Tooltips Initialization
        $(function () {
            $('[data-toggle="tooltip"]').tooltip()
        })
    </script>

    <script>
        // Material Select Initialization
        $(document).ready(function () {
            $('.mdb-select').material_select();
        });
    </script>
    <script>
        // SideNav Initialization
        $(".button-collapse").sideNav();
    </script>