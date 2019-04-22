<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<jsp:include page="common/head.jsp"/>
	
	<style>
    	.map-container{
      		overflow:hidden;
      		padding-bottom:56.25%;
      		position:relative;
      		height:0;
    	}
    	.map-container iframe{
      		left:0;
      		top:0;
      		height:100%;
      		width:100%;
      		position:absolute;
    	}
	</style>
</head>
<body class="homepage-v3 hidden-sn white-skin animated">

	<!--Navigation-->
    	<jsp:include page="common/header.jsp"/>
    <!-- /.Navigation -->
    
    <section>
      <!--Google map-->
      <div id="map-container" class="z-depth-1-half map-container" style="height: 500px">
        <iframe src="https://maps.google.com/maps?q=manhatan&amp;t=&amp;z=13&amp;ie=UTF8&amp;iwloc=&amp;output=embed" frameborder="0" style="border:0"
          allowfullscreen></iframe>
      </div>
  </section>

  <!--Main Layout-->
  <main>

    <div class="container-fluid mb-5">

      <!--Grid row-->
      <div class="row" style="margin-top: -140px;">

        <!--Grid column-->
        <div class="col-md-12">
          <div class="card pb-5">
            <div class="card-body">

              <div class="container">

                <!-- Section: Contact v.3 -->
                <section class="contact-section my-5">

                  <!-- Form with header -->
                  <div class="card">

                    <!-- Grid row -->
                    <div class="row">

                      <!-- Grid column -->
                      <div class="col-lg-8">

                        <div class="card-body form">

                          <!-- Header -->
                          <h3 class="mt-4"><i class="fas fa-envelope pr-2"></i>Write to us:</h3>

                          <!-- Grid row -->
                          <div class="row">

                            <!-- Grid column -->
                            <div class="col-md-6">
                              <div class="md-form mb-0">
                                <input type="text" id="form-contact-name" class="form-control">
                                <label for="form-contact-name" class="">Your name</label>
                              </div>
                            </div>
                            <!-- Grid column -->

                            <!-- Grid column -->
                            <div class="col-md-6">
                              <div class="md-form mb-0">
                                <input type="text" id="form-contact-email" class="form-control">
                                <label for="form-contact-email" class="">Your email</label>
                              </div>
                            </div>
                            <!-- Grid column -->

                          </div>
                          <!-- Grid row -->

                          <!-- Grid row -->
                          <div class="row">

                            <!-- Grid column -->
                            <div class="col-md-6">
                              <div class="md-form mb-0">
                                <input type="text" id="form-contact-phone" class="form-control">
                                <label for="form-contact-phone" class="">Your phone</label>
                              </div>
                            </div>
                            <!-- Grid column -->

                            <!-- Grid column -->
                            <div class="col-md-6">
                              <div class="md-form mb-0">
                                <input type="text" id="form-contact-company" class="form-control">
                                <label for="form-contact-company" class="">Your company</label>
                              </div>
                            </div>
                            <!-- Grid column -->

                          </div>
                          <!-- Grid row -->

                          <!-- Grid row -->
                          <div class="row">

                            <!-- Grid column -->
                            <div class="col-md-12">
                              <div class="md-form mb-0">
                                <textarea type="text" id="form-contact-message" class="form-control md-textarea" rows="3"></textarea>
                                <label for="form-contact-message">Your message</label>
                                <a class="btn-floating btn-lg blue">
                                  <i class="far fa-paper-plane"></i>
                                </a>
                              </div>
                            </div>
                            <!-- Grid column -->

                          </div>
                          <!-- Grid row -->

                        </div>

                      </div>
                      <!-- Grid column -->

                      <!-- Grid column -->
                      <div class="col-lg-4">

                        <div class="card-body contact text-center h-100 white-text">

                          <h3 class="my-4 pb-2">Contact information</h3>
                          <ul class="text-lg-left list-unstyled ml-4">
                            <li>
                              <p><i class="fas fa-map-marker-alt pr-2 mb-4"></i>New York, 94126, USA</p>
                            </li>
                            <li>
                              <p><i class="fas fa-phone pr-2 mb-4"></i>+ 01 234 567 89</p>
                            </li>
                            <li>
                              <p><i class="fas fa-envelope pr-2"></i>contact@example.com</p>
                            </li>
                          </ul>
                          <hr class="hr-light my-4">
                          <ul class="list-inline text-center list-unstyled">
                            <li class="list-inline-item">
                              <a class="p-2 fa-lg tw-ic">
                                <i class="fab fa-twitter"></i>
                              </a>
                            </li>
                            <li class="list-inline-item">
                              <a class="p-2 fa-lg li-ic">
                                <i class="fab fa-linkedin-in"> </i>
                              </a>
                            </li>
                            <li class="list-inline-item">
                              <a class="p-2 fa-lg ins-ic">
                                <i class="fab fa-instagram"> </i>
                              </a>
                            </li>
                          </ul>

                        </div>

                      </div>
                      <!-- Grid column -->

                    </div>
                    <!-- Grid row -->

                  </div>
                  <!-- Form with header -->

                </section>
                <!-- Section: Contact v.3 -->

              </div>

            </div>
          </div>
        </div>
        <!--Grid column-->

      </div>
      <!--Grid row-->

    </div>

  </main>
  <!--Main Layout-->
    
     <!--Footer-->
    	<jsp:include page="common/footer.jsp"/>
    <!--/.Footer-->

	
	 <!-- Cart Modal -->
	  <div class="modal fade cart-modal" id="cart-modal-ex" tabindex="-1" role="dialog" aria-labelledby="myModalLabel"
	    aria-hidden="true">
	    <div class="modal-dialog" role="document">
	      <!--Content-->
	      <div class="modal-content">
	        <!--Header-->
	        <div class="modal-header">
	
	          <h4 class="modal-title font-weight-bold dark-grey-text" id="myModalLabel">Your cart</h4>
	          <button type="button" class="close" data-dismiss="modal" aria-label="Close">
	            <span aria-hidden="true">&times;</span>
	          </button>
	        </div>
	        <!--Body-->
	        <div class="modal-body">
	
	          <table class="table table-hover">
	            <thead>
	              <tr>
	                <th>#</th>
	                <th>Product name</th>
	                <th>Price</th>
	                <th>Remove</th>
	              </tr>
	            </thead>
	            <tbody>
	              <tr>
	                <th scope="row">1</th>
	                <td>Product 1</td>
	                <td>100$</td>
	                <td><a><i class="fas fa-eraser"></i></a></td>
	              </tr>
	              <tr>
	                <th scope="row">2</th>
	                <td>Product 2</td>
	                <td>100$</td>
	                <td><a><i class="fas fa-eraser"></i></a></td>
	              </tr>
	              <tr>
	                <th scope="row">3</th>
	                <td>Product 3</td>
	                <td>100$</td>
	                <td><a><i class="fas fa-eraser"></i></a></td>
	              </tr>
	              <tr>
	                <th scope="row">4</th>
	                <td>Product 4</td>
	                <td>100$</td>
	                <td><a><i class="fas fa-eraser"></i></a></td>
	              </tr>
	
	            </tbody>
	          </table>
	
	          <button class="btn btn-primary btn-rounded btn-sm">Checkout</button>
	
	        </div>
	        <!--Footer-->
	        <div class="modal-footer">
	          <button type="button" class="btn btn-grey btn-rounded btn-sm" data-dismiss="modal">Close</button>
	        </div>
	      </div>
	      <!--/.Content-->
	    </div>
	  </div>
  	<!-- /.Cart Modal -->

    <!-- SCRIPTS -->
		<jsp:include page="common/scripts.jsp"/>
	<!-- SCRIPTS -->
</body>
</html>