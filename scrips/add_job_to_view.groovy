import jenkins.model.*

def jobName  = "NewJob"
def viewName = 'a_view'
println jobName + ' '+ viewName
def v = Jenkins.instance.getView(viewName)
def i = Jenkins.instance.getItemByFullName(jobName)
if (v && i) {
  v.add(i)
}
