<!DOCTYPE html>
<html>
<head>
<link
	href="//netdna.bootstrapcdn.com/bootstrap/3.0.0/css/bootstrap.min.css"
	rel="stylesheet" id="bootstrap-css">
<script
	src="//netdna.bootstrapcdn.com/bootstrap/3.0.0/js/bootstrap.min.js"></script>
<script src="//code.jquery.com/jquery-1.11.1.min.js"></script>
</head>
<body>
<form id="card" class="form-horizontal" role="form" method="post" action="rest/card/getcuststatejson">
			<fieldset>
				<legend>Credit Card</legend>
				<div class="form-group">
					<label class="col-sm-3 control-label" for="card-holder-name">Name
						on Card:</label>
					<div class="col-sm-6">
						<input type="text" class="form-control" name="card_holder_name"
							id="card_holder_name" placeholder="Card Holder's Name"
							onkeyup="Validate(this,'errName','Name')" required>
					</div>
					<div class="col-sm-3" id="errName"></div>
				</div>
				<div class="form-group">
					<label class="col-sm-3 control-label" for="card-number">Card
						Number:</label>
					<div class="col-sm-6">
						<input type="text" class="form-control" name="card_number"
							id="card_number" placeholder="Credit Card Number" onkeyup="validateCardNo(this, 'errCNO')" maxlength="16" required>
					</div>
					<div class="col-sm-3" id="errCNO"></div>
				</div>
				<div class="form-group">
					<label class="col-sm-3 control-label" for="expiry_date">Expiration
						Date:</label>
					<div class="col-sm-6">
						<input type="text" class="form-control" name="expiry_date"
							id="expiry_date" placeholder="mm/yyyy" maxlength="7" onkeyup="validateExpDate(this, 'errED')" required>
					</div>
					<div class="col-sm-3" id="errED"></div>
				</div>
				<div class="form-group">
					<label class="col-sm-3 control-label" for="cvv">Card CVV:</label>
					<div class="col-sm-6">
						<input type="text" class="form-control" name="cvv" id="cvv"
							placeholder="Security Code" maxlength="3" onkeyup="validateCvv(this, 'errCVV')" required>
					</div>
					<div class="col-sm-3" id="errCVV"></div>
				</div>
				<div class="form-group">
					<div class="col-sm-offset-3 col-sm-6">
						<input type="submit" class="btn btn-success"
							value="Get Statement">
					</div>
				</div>
			</fieldset>
		</form>
</body>
</html>
