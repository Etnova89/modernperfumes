import React from 'react'

class ParseExcel extends React.Component {
    constructor(props) {
        super(props);
    }
    state = {
        perfumes: []
    };
    componentDidMount() {
        fetch("http://localhost:8080/api/v1/prices/parse/", {
            method: 'post'})
            .then(res => res.json())
            .then(data => {
                this.setState({ perfumes: data });
            })
            .catch(console.log);
    }
    render() {
        return (
            <>
                <h2>Perfumes</h2>
                <table className="table">
                    <thead>
                        <tr>
                            <th>Description</th>
                            <th>Price</th>
                        </tr>
                    </thead>
                    <tbody>
                        {this.state.perfumes.map(perfume => {
                            return (
                                <tr key={perfume.id}>
                                    <td>{perfume.description}</td>
                                    <td>{perfume.price}</td>
                                </tr>
                            );
                        })}
                    </tbody>
                </table>
            </>
        );
    }
}
export default ParseExcel;