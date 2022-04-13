import { createStore } from "redux";
import reducer from './reducer'

const initialStage= {loggedin:false}
const mystore=createStore(reducer,initialStage);

export default mystore;