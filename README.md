# Flickwiz cli
Flickwiz `v1.0.0` is ready for release!!!
<br><br>
![GUI](queryImages/iron.jpg)
<br></br>
##How to build and Run
#### Download
`git clone https://github.com/skunkworks002/flickwiz-cli.git`
<br>OR<br>
Download zip file - [download](https://github.com/skunkworks002/flickwiz-cli/archive/master.zip)
<br>
####Build
**Build with maven**<br>
* run the following command from project's root directory:<br>
`mvn clean package`


####Run in command line mode
* Inside project root directory, run one of the following startup file depending on the type of platform:<br> 
`bash startup.sh` **Linux**<br>
`startup.bat` **Windows**
<br><br>

Run either of the available flickwiz>> commands</b>

####Help
use option `--help` with tsak command to display command options e.g.<br>
`flickwiz>> getMatch --help`


####Available Flickwiz Commands [detail usage](https://github.com/skunkworks002/flickwiz-cli/wiki/Command-Line-Usage)

`flickwiz>>  getMatch -i queryImages/iron.jpg`<br>
`flickwiz>>  getMatch --help`<br>


## License
The code is licensed under the [Apache License Version 2.0](http://www.apache.org/licenses/LICENSE-2.0)

