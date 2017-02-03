My code performs all the neccesary operations of liquid measurement converter.I also documented the  code by commenting the performing operation.

I have created two radiogroups one for input radio buttons and other for output radio button.

My code logic:
I used  fluidounce as medium of conversion to decrease the redundancy of code.
when Any input unit of radio button is clicked its corresponding value gets converted into equivalent fluid ounce unit.By using this fluid ounce value,we can convert it into required  equivalent output measurement unit.Thus given input unit value is converted into required equivalent output unit.

I used getCheckedRadioButtonId() method to know which radiobutton measurment unit is clicked from input radiogroup and outputradiogroup and stored in selectedinputid and outputselectedId.

By taking selectedinputid in switch expression and using   ids of input measurement unit radiobuttons in cases,when selectedinputid is equal to case id then entered numeric value will first convert into unit of fluidounce and stores in input.

Now By taking outputselectedId in another switch expression and using  ids of output measurement unit radiobuttonsin cases,when outputselectedId is equal to case id then the input value will be converted to required equivalent measurment unit and stores in output.

I used decimal formater to  trail the unnecessary zeros in output and if output is decimal number then displays upto three decimal points.
Hence for any input measurement unit it converts into equivalent output unit and displays on screen.

uploaded in git


