import React, { Component } from "react";
import { Link } from "react-router-dom";
import GoogleMapReact from "google-map-react";

// The Player looks up the player using the number parsed from
// the URL's pathname. If no player is found with the given
// number, then a "player not found" message is displayed.
class ListElement extends Component {
  //here will be placed map

  static defaultProps = {
    center: {
      lat: 52.22977,
      lng: 21.01178
    },
    zoom: 11
  };

  handleApiLoaded = (map, maps, post) => {
    console.log(post, "listelement in api")
    let path = post.singlePins.map(pin => {
      console.log(pin, 'pin')
      return { lng: pin.longitude, lat: pin.latitude };
    });
console.log(path)
    // Construct the polygon.
    let area = new maps.Polygon({
      paths: path,
      strokeColor: "#FF0000",
      strokeOpacity: 0.8,
      strokeWeight: 2,
      fillColor: "#FF0000",
      fillOpacity: 0.35
    });
    area.setMap(map);
  };

  render() {
    const post = this.props.data[parseInt(this.props.match.params.number, 10)];

    console.log(post, "ListElement");
    if (!post) {
      return <div>Sorry, but the post was not found</div>;
    }
    const { description, mail, name, phone } = post;
    return (
      <div>
        <h1>{name}</h1>
        <p>{description}</p>
        <p>{mail}</p>
        <p>{phone}</p>
        <Link to="/list">Back</Link>
        <div style={{ height: "100vh", width: "100%" }}>
          <GoogleMapReact
            bootstrapURLKeys={{
              key: "AIzaSyC1gH-KosO28vNz-ZbWQMNM2PmOp3caZE0"
            }}
            defaultCenter={this.props.center}
            defaultZoom={this.props.zoom}
            yesIWantToUseGoogleMapApiInternals
            onGoogleApiLoaded={({ map, maps }) =>
              this.handleApiLoaded(map, maps, post)
            }
          />
        </div>
      </div>
    );
  }
}
export default ListElement;
