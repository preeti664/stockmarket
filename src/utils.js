

import { csvParse} from  "d3-dsv";
import { timeParse } from "d3-time-format";

function parseData(parse) {
	return function(d) {
		d.timestamp = parse(d.timestamp);
		d.open = +d.open;
		d.high = +d.high;
		d.low = +d.low;
		d.close = +d.close;
		d.volume = +d.volume;

		return d;
	};
}

const parseDate = timeParse("%Y-%m-%d");

export function getData() {
	//console.log(pointerToThis);
        const API_KEY = 'IE19I6WP7YIVA9B9';
        let StockSymbol = 'FB';
        let API_Call = `https://www.alphavantage.co/query?function=TIME_SERIES_MONTHLY&symbol=${StockSymbol}MSFT&apikey=compact&datatype=${API_KEY}=csv`
		fetch(API_Call)
          .then(
            function(response) {
              return response.json();
            }
          )
          
		.then(response => response.text())
		.then(data => csvParse(data, parseData(parseDate)))
	return API_Call;
		  
}