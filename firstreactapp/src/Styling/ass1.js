import React from 'react';
class Style2 extends React.Component{
    constructor(props)
    {
        super(props);
    }
    render(){
        return(
           <header>
               <div className="jumbotron p-5 text-center bg-light">
                <h3 className="mb-3">Welcome to React</h3>
                <table className="table">
                <thead className="thead-dark">
                    <tr><th>Features of react </th></tr>
                </thead>
                <tbody>
                <tr><td>JSX - JavaScript Syntax Extension</td></tr>
                <tr><td>Virtual DOM</td></tr>
                <tr><td>Performance</td></tr>
                <tr><td>Extensions</td></tr>
                <tr><td>One-way Data Binding</td></tr>
                <tr><td>Debugging</td></tr>
                </tbody>
            </table>
            </div>
           </header>
        );
    }
}
export default Style2;