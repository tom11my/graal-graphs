import glob
import subprocess

DEST_DIR = "../c++progs/graphs"
DEST_DIR = "/Users/tommyjoseph/desktop/graal/c++_progs/graphs"
FROM_DIR = "../c++progs/graal_dumps"
FROM_DIR = "/Users/tommyjoseph/desktop/graal/c++_progs/graal_dumps"
BGV_LAYER = 1
SEAFOAM = "/opt/homebrew/lib/ruby/gems/3.1.0/gems/seafoam-0.14/bin/seafoam"
print('start')
for i, f in enumerate(glob.glob(f"{FROM_DIR}/*.bgv")):
    print("saving pdf for file", i)
    gen_command = f"{SEAFOAM} {f}:{BGV_LAYER} render --out {f}.pdf"

    mv_command = f"mv {f}.pdf {DEST_DIR}"

    process = subprocess.Popen(gen_command.split(), stdout=subprocess.PIPE)
    output, error = process.communicate()
    print("output:", output)
    print("error:", output)

    process = subprocess.Popen(mv_command.split(), stdout=subprocess.PIPE)
    output, error = process.communicate()
    print("output:", output)
    print("error:", output)
