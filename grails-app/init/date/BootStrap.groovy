package date

class BootStrap {

    def init = { servletContext ->
    	System.out.println "${new Date().dateString}"
    }
    def destroy = {
    }
}
