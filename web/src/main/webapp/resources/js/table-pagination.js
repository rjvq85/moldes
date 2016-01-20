$(document).ready(function () {
    $('#moldtable').DataTable({
        "language": {
            "sEmptyTable":     "Sem dados disponíveis",
            "sInfo":           "A mostrar de _START_ até _END_ de um total de _TOTAL_ registos",
            "sInfoEmpty":      "A mostrar de 0 até 0 de um total de 0 registos",
            "sInfoFiltered":   "(filtrando de _MAX_ registos no total)",
            "sInfoPostFix":    "",
            "sInfoThousands":  ",",
            "sLengthMenu":     "_MENU_ entradas por página",
            "sLoadingRecords": "A carregar...",
            "sProcessing":     "A processar...",
            "sSearch":         "Procurar:",
            "sZeroRecords":    "Nenhum resultado encontrado",
            "oPaginate": {
                "sFirst":    "Ínicio",
                "sLast":     "Fim",
                "sNext":     "Próx.",
                "sPrevious": "Anter."
            },
            "oAria": {
                "sSortAscending":  ": activar para ordenar de forma ascendente",
                "sSortDescending": ": activar para ordenar de forma descendente"
            }
        }
    });
});
