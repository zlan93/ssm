$(document).ready(
		function() {
			// home Tab
			$('.titletab li').click(
					function() {
						$(this).addClass("active").siblings().removeClass();
						$(this).parent().parent().parent().find(".content")
								.hide()
								.eq($(this).parent().children().index(this))
								.show();
					});

		});