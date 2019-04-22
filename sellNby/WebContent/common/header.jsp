

<!--Navigation-->
    <header>
        <!-- Navbar -->
        <nav class="navbar fixed-top navbar-expand-lg  navbar-light scrolling-navbar white">
            <div class="container">
                <a class="navbar-brand font-weight-bold" href="index.jsp">
                    <img src="assets/img/logo/sellNby.png" style="height: 60px;">    
                </a>
                <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarSupportedContent-4" aria-controls="navbarSupportedContent-4"
                    aria-expanded="false" aria-label="Toggle navigation">
                        <span class="navbar-toggler-icon"></span>
                    </button>
                <div class="collapse navbar-collapse" id="navbarSupportedContent-4">
                    <ul class="navbar-nav ml-auto">
                        <li class="nav-item">
                            <a class="nav-link waves-effect waves-light dark-grey-text font-weight-bold" href="contact.jsp"><i class="fas fa-envelope blue-text"></i> Contact <span class="sr-only">(current)</span></a>
                        </li>
                        <li class="nav-item ml-3">
                            <a class="nav-link waves-effect waves-light dark-grey-text font-weight-bold" href="#"><i class="fas fa-cog blue-text"></i> Settings</a>
                        </li>
                        <li class="nav-item ml-3">
                            <a class="nav-link waves-effect waves-light dark-grey-text font-weight-bold" data-toggle="modal" data-target="#modalLRForm"><i class="fas fa-sign-in-alt blue-text"></i> Login</a>
                        </li>
                        <li class="nav-item dropdown ml-3">
                            <a class="nav-link dropdown-toggle waves-effect waves-light dark-grey-text font-weight-bold" id="navbarDropdownMenuLink-4" data-toggle="dropdown"
                                aria-haspopup="true" aria-expanded="false"><i class="fas fa-user blue-text"></i> Profile </a>
                            <div class="dropdown-menu dropdown-menu-right dropdown-cyan" aria-labelledby="navbarDropdownMenuLink-4">
                                <a class="dropdown-item waves-effect waves-light" href="myaccount.jsp">My account</a>
                                <a class="dropdown-item waves-effect waves-light" href="#">Log out</a>
                            </div>
                        </li>
                    </ul>
                </div>
            </div>
        </nav>
        <!-- /.Navbar -->

    </header>
    <!-- /.Navigation -->
    
    
    <!--Modal: Login / Register Form-->
		<div class="modal fade" id="modalLRForm" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
		  <div class="modal-dialog cascading-modal" role="document">
		    <!--Content-->
		    <div class="modal-content">
		
		      <!--Modal cascading tabs-->
		      <div class="modal-c-tabs">
		
		        <!-- Nav tabs -->
		        <ul class="nav nav-tabs md-tabs tabs-2 light-blue darken-3" role="tablist">
		          <li class="nav-item">
		            <a class="nav-link active" data-toggle="tab" href="#panel7" role="tab"><i class="fas fa-user mr-1"></i>
		              Login</a>
		          </li>
		          <li class="nav-item">
		            <a class="nav-link" data-toggle="tab" href="#panel8" role="tab"><i class="fas fa-user-plus mr-1"></i>
		              Register</a>
		          </li>
		        </ul>
		
		        <!-- Tab panels -->
		        <div class="tab-content">
		          <!--Panel 7-->
		          <div class="tab-pane fade in show active" id="panel7" role="tabpanel">
		
		            <!--Body-->
		            <div class="modal-body mb-1">
		            	<form class="needs-validation" novalidate>
			              <div class="md-form form-sm mb-5">
			                <i class="fas fa-envelope prefix"></i>
			                <input type="email" id="modalLRInput10" class="form-control form-control-sm validate">
			                <label data-error="wrong" data-success="right" for="modalLRInput10">Your email</label>
			              </div>
			
			              <div class="md-form form-sm mb-4">
			                <i class="fas fa-lock prefix"></i>
			                <input type="password" id="modalLRInput11" class="form-control form-control-sm validate">
			                <label data-error="wrong" data-success="right" for="modalLRInput11">Your password</label>
			              </div>
			              <div class="text-center mt-2">
		                <button class="btn btn-info">Log in <i class="fas fa-sign-in ml-1"></i></button>
		              </div>
		            	</form>
		            </div>
		            <!--Footer-->
		            <div class="modal-footer">
		              <div class="options text-center text-md-right mt-1">
		                <p>Forgot <a href="#" class="blue-text">Password?</a></p>
		              </div>
		              <button type="button" class="btn btn-outline-info waves-effect ml-auto" data-dismiss="modal">Close</button>
		            </div>
		
		          </div>
		          <!--/.Panel 7-->
		
		          <!--Panel 8-->
		          <div class="tab-pane fade" id="panel8" role="tabpanel">
		
		            <!--Body-->
		            <div class="modal-body">
		              <div class="md-form form-sm mb-5">
		                <i class="fas fa-envelope prefix"></i>
		                <input type="email" id="modalLRInput12" class="form-control form-control-sm validate">
		                <label data-error="wrong" data-success="right" for="modalLRInput12">Your email</label>
		              </div>
		
		              <div class="md-form form-sm mb-5">
		                <i class="fas fa-lock prefix"></i>
		                <input type="password" id="modalLRInput13" class="form-control form-control-sm validate">
		                <label data-error="wrong" data-success="right" for="modalLRInput13">Your password</label>
		              </div>
		
		              <div class="md-form form-sm mb-4">
		                <i class="fas fa-lock prefix"></i>
		                <input type="password" id="modalLRInput14" class="form-control form-control-sm validate">
		                <label data-error="wrong" data-success="right" for="modalLRInput14">Repeat password</label>
		              </div>
		
		              <div class="text-center form-sm mt-2">
		                <button class="btn btn-info">Sign up <i class="fas fa-sign-in ml-1"></i></button>
		              </div>
		
		            </div>
		            <!--Footer-->
		            <div class="modal-footer">
		              <div class="options text-right">
		                <p class="pt-1">Already have an account? <a href="#" class="blue-text">Log In</a></p>
		              </div>
		              <button type="button" class="btn btn-outline-info waves-effect ml-auto" data-dismiss="modal">Close</button>
		            </div>
		          </div>
		          <!--/.Panel 8-->
		        </div>
		
		      </div>
		    </div>
		    <!--/.Content-->
		  </div>
		</div>
	<!--/Modal: Login / Register Form-->
		