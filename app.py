import numpy as np
from flask import Flask, request, jsonify, render_template
import pickle


model = pickle.load(open('model.pkl', 'rb'))
print('model is loaded')
app = Flask(__name__)

@app.route('/',methods=['GET'])
def index():
    Age=float (request.args['Age'])
    Weight=float (request.args['Weight'])
    Height=float (request.args['Height'])
    BMI=float (request.args['BMI'])
    BloodGroup=float (request.args['BloodGroup'])
    Pulserate=float (request.args['Pulserate'])
    RR=float (request.args['RR'])
    Hb=float (request.args['Hb'])
    Cycle=float (request.args['Cycle'])
    Cyclelength=float (request.args['Cyclelength'])
    MarriageStatus=float (request.args['MarriageStatus'])
    Pregnant=float (request.args['Pregnant'])
    Noofabortions=float (request.args['Noofabortions'])
    IbetaHCG=float (request.args['IbetaHCG'])
    IIbetaHCG=float (request.args['IIbetaHCG'])
    FSH=float (request.args['FSH'])
    LH=float (request.args['LH'])
    FSH_LH=float (request.args['FSH_LH'])
    Hip=float (request.args['Hip'])
    Waist=float (request.args['Waist'])
    WaistHipRatio=float (request.args['WaistHipRatio'])
    TSH=float (request.args['TSH'])
    AMH=float (request.args['AMH'])
    PRL=float (request.args['PRL'])
    VitD3=float (request.args['VitD3'])
    PRG=float (request.args['PRG'])
    RBS=float (request.args['RBS'])
    Weightgain=float (request.args['Weightgain'])
    hairgrowth=float (request.args['hairgrowth'])
    Skindarkening=float (request.args['Skindarkening'])
    Hairloss=float (request.args['Hairloss'])
    Pimples=float (request.args['Pimples'])
    Fastfood=float (request.args['Fastfood'])
    RegExercise=float (request.args['RegExercise'])
    BP_Systolic=float (request.args['BP_Systolic'])
    BP_Diastolic=float (request.args['BP_Diastolic'])
    FollicleNo1=float (request.args['FollicleNo1'])
    FollicleNo2=float (request.args['FollicleNo2'])
    AvgFsize1=float (request.args['AvgFsize1'])
    AvgFsize2=float (request.args['AvgFsize2'])
    Endometrium=float (request.args['Endometrium'])
    
    
    pred=model.predict(np.array([Age,
                                 Weight,
                                 Height,
                                 BMI,
                                 BloodGroup,
                                 Pulserate,
                                 RR,
                                 Hb,
                                 Cycle,
                                 Cyclelength,
                                 MarriageStatus,
                                 Pregnant,
                                 Noofabortions,
                                 IbetaHCG,
                                 IIbetaHCG,
                                 FSH,
                                 LH,
                                 FSH_LH,
                                 Hip,
                                 Waist,
                                 WaistHipRatio,
                                 TSH,
                                 AMH,
                                 PRL,
                                 VitD3,
                                 PRG,
                                 RBS,
                                 Weightgain,
                                 hairgrowth,
                                 Skindarkening,
                                 Hairloss,
                                 Pimples,
                                 Fastfood,
                                 RegExercise,
                                 BP_Systolic,
                                 BP_Diastolic,
                                 FollicleNo1,
                                 FollicleNo2,
                                 AvgFsize1,
                                 AvgFsize2,
                                 Endometrium]).reshape(1,-1))
    #return jsonify(prediction=str(pred))
    return str(pred)
if __name__ == "__main__":
    app.run(debug=True)